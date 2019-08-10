package com.panickapps.javahttp;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by PaNickApps - 2019
 * Visit http://www.panickapps.com
 *
 * Java-HTTP: A Java utility library that makes HTTP requests easier to work with.
 * Java HTTP allows easy creation and execution of HTTP requests.
 * Repository: https://github.com/panickapps/Java-HTTP
 * Guide: https://panickapps.github.io/Java-HTTP
 */

/**
 * A utility class which creates query strings.
 */
public class QueryStringMaker {

    /**
     * Creates a query string given a map of parameters.
     * @param params The set of parameters to convert into a query string.
     * @return Returns a query-formatted String.
     * @throws UnsupportedEncodingException
     */
    public static String makeQueryString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }
        String resultString = result.toString();
        return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) : resultString;
    }

}
