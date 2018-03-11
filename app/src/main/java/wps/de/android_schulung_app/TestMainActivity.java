package wps.de.android_schulung_app;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;

import wps.de.android_schulung_app.databinding.ActivityTestMainBinding;

/**
 * Created by Adrian on 11.03.2018.
 */

public class TestMainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TestDataMethod devInfo = new TestDataMethod(String.format("%s %s|%s", Build.BRAND, Build.DEVICE, Build.MODEL), String.format("OS: %s | SDK: %d", Build.VERSION.RELEASE, Build.VERSION.SDK_INT));
        ActivityTestMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_test_main);
        binding.setDevInfo(devInfo);
    }
}
