/*
 * Class Name: ImportantTweet
 *
 * Version: Version 1.0
 *
 * Copyright (C) JPrieto, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Student Behaviour at the University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message,date);
    }

    /**
     * determines if the Tweet type is Important, implemented on classes that uses the abstract class
     * @return true
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
