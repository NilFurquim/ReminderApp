package nilfurquim.reminderapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by NilFu on 05/12/2017.
 */

public class ReminderList extends ArrayAdapter {
    ArrayList<Reminder> reminders;
    Activity ctx;

    public ReminderList(Activity ctx, ArrayList<Reminder> rems) {
        super(ctx, R.layout.listline_reminder);
        this.ctx = ctx;
        this.reminders = rems;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ctx.getLayoutInflater();
        View view = inflater.inflate(R.layout.listline_reminder,null,false);

        ImageView ivImage = (ImageView) view.findViewById(R.id.item_reminder_image);
        TextView tvName = (TextView) view.findViewById(R.id.item_reminder_name);
        Button buttonAudio = (Button) view.findViewById(R.id.item_play_audio);
        TextView time = (TextView) view.findViewById(R.id.item_reminder_time);

        tvName.setText(reminders.get(pos).name);
        ivImage.setImageBitmap(reminders.get(pos).image);
        time.setText(reminders.get(pos).time);
        return view;
    }

}
