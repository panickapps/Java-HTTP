package com.panickapps.javahttp;

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
 * Models the possible HTTP request methods.
 */
public enum RequestMethod {

    GET,
    POST,
    HEAD,
    OPTIONS,
    PUT,
    TRACE,
    DELETE,
    PATCH,
    COPY,
    LINK,
    UNLINK,
    PURGE,
    LOCK,
    UNLOCK,
    PROPFIND,
    VIEW

    ;

    /**
     * Returns the string representation of the HTTP request method.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
