package com.acro.cms.util;

import java.util.ResourceBundle;

public interface BundleReaders {
	/**
	 * This method read the config file and return the ResourceBundle Object
	 * @return
	 */
	public static ResourceBundle readResourceBundle(){
		//ResourceBundle rb = new ResourceBundle(); // abstract class
		ResourceBundle rb = ResourceBundle.getBundle("Configs");
		return rb;
	}
	public static String getValue(String key){
		ResourceBundle rb = readResourceBundle();
		String value = rb.getString(key);
		return  value;
	}
}