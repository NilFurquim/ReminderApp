package nilfurquim.reminderapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NilFu on 05/12/2017.
 */

public class ReminderList extends BaseAdapter {
    List<Reminder> reminders;
    Activity ctx;

    public ReminderList(Activity ctx, List<Reminder> reminders) {
        this.reminders = reminders;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return reminders.size();
    }

    @Override
    public Object getItem(int position) {
        return reminders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ctx.getLayoutInflater();
        // View view = inflater.inflate(R.layout.listline_reminder,null,false);

        View view = ctx.getLayoutInflater()
                .inflate(R.layout.listline_reminder, parent, false);
        Reminder reminder = reminders.get(pos);

        ImageView ivImage = (ImageView) view.findViewById(R.id.item_reminder_image);
        TextView tvName = (TextView) view.findViewById(R.id.item_reminder_name);
        Button buttonAudio = (Button) view.findViewById(R.id.item_play_audio);
        TextView time = (TextView) view.findViewById(R.id.item_reminder_time);

        tvName.setText(reminder.name);
        ivImage.setImageBitmap(reminder.image);
        time.setText(reminder.time);
        return view;
    }

}
