package materialdesign.interra.com.tablayout;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecentCallFragment extends Fragment {

    public RecentCallFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_recent_call_list, container, false);

        final ArrayList<Call> callArrayList = new ArrayList<>();
        Call call = new Call("Cenk Tosun", "23 mins", R.drawable.man);
        callArrayList.add(call);
        call = new Call("Şukufe Şuku", "5 mins", R.drawable.girl);
        callArrayList.add(call);
        call = new Call("Buse Yogi", "12 mins", R.drawable.girl);
        callArrayList.add(call);
        call = new Call("Hasan Avludayatar", "7 mins", R.drawable.man);
        callArrayList.add(call);

        RecyclerView recyclerView = view.findViewById(R.id.recentRecycler);
        final CallAdapter callAdapter = new CallAdapter(callArrayList, view.getContext());
        recyclerView.setAdapter(callAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);


        return view;
    }
}
