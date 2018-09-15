package fr.inria.coming.main;

import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author Matias Martinez, matias.martinez@inria.fr
 *
 */
public class ConfigurationProperties {

	public static Properties properties;

	static {
		InputStream propFile;
		try {
			properties = new Properties();
			propFile = ConfigurationProperties.class.getClassLoader().getResourceAsStream("configuration.properties");

			properties.load(propFile);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static Integer getPropertyInteger(String key) {
		return Integer.valueOf(properties.getProperty(key));
	}

	public static Boolean getPropertyBoolean(String key) {
		return Boolean.valueOf(properties.getProperty(key));
	}

	public static Double getPropertyDouble(String key) {
		return Double.valueOf(properties.getProperty(key));
	}

	public static void main(String[] s) {
		String ss = ConfigurationProperties.properties.getProperty("test");
		System.out.println("-->" + ss);
	}
}
