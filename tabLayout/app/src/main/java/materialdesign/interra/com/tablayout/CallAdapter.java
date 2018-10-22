package materialdesign.interra.com.tablayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallViewHolder> {

    private ArrayList<Call> mList;
    private Context mContext;

    CallAdapter(ArrayList<Call> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CallViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.call, viewGroup, false);
        return new CallViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallViewHolder callViewHolder, int i) {
        final Call call = mList.get(i);
        callViewHolder.personName.setText(call.getmName());
        callViewHolder.personTime.setText(call.getmTime());
        callViewHolder.personIcon.setImageResource(call.getmPersonIcon());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

     class CallViewHolder extends RecyclerView.ViewHolder{
        TextView personName;
        TextView personTime;
        ImageView personIcon;

         CallViewHolder(@NonNull View itemView) {
            super(itemView);

            personName = itemView.findViewById(R.id.personName);
            personTime = itemView.findViewById(R.id.personTime);
            personIcon = itemView.findViewById(R.id.personPicture);
        }
    }
}
