package c.lh.library_main.ui;

import android.os.Bundle;

import c.lh.library_main.BR;
import c.lh.library_main.R;
import c.lh.library_main.databinding.ActivityMainBinding;
import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding,BaseViewModel> {


    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
