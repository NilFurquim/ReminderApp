package nilfurquim.reminderapp;

import android.graphics.Bitmap;

/**
 * Created by NilFu on 05/12/2017.
 */

public class Reminder {
    String name;
    String time;
    String audioPath;
    Bitmap image;

    public Reminder(String name, String time, String audioPath) {
        this.name = name;
        this.time = time;
        this.audioPath = audioPath;
    }

    public Reminder(String name, String time, String audioPath, Bitmap image) {
        this.name = name;
        this.time = time;
        this.audioPath = audioPath;
        this.image = image;
    }
}
