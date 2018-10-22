package materialdesign.interra.com.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static java.sql.Types.NULL;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        CallPagerAdapter callPagerAdapter = new CallPagerAdapter(getSupportFragmentManager());
        callPagerAdapter.addFragment(new RecentCallFragment(), "RECENT");
        callPagerAdapter.addFragment(new FavouriteCallFragment(), "FAVOURITE");
        callPagerAdapter.addFragment(new ContactCallFragment(), "CONTACTS");
        callPagerAdapter.addFragment(new KeypadCallFragment(), "KEYPAD");
        callPagerAdapter.addFragment(new VoicemailCallFragment(), "VOICEMAIL");


        viewPager.setAdapter(callPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_star_border_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_person_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_dialpad_black_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_voicemail_black_24dp);
    }
}
