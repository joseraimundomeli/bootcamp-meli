import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {

    private static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "./src/main/java/interfaces/MyFactory.properties");
        props.load(file);
        return props;

    }
    public Sorter getInstance (String objName) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException{
        Properties prop = getProp();
        String algoritmo = prop.getProperty(objName);
        return (Sorter) Class.forName(algoritmo).getConstructor().newInstance();
    }

    public static String teste(){
        return "";
    }

}
