package c.lh.library_main.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.ArrayList;
import java.util.List;

import c.lh.library_base.router.RouterFragmentPath;
import c.lh.library_main.BR;
import c.lh.library_main.R;
import c.lh.library_main.databinding.ActivityMainBinding;
import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public class MainActivity extends BaseActivity<ActivityMainBinding,BaseViewModel> {

    private List<Fragment> mFragments;
    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
        initFragment();
        initBottomTab();
    }

    private void initFragment() {
        Fragment homeFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();
        Fragment homeFragment1 = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();
        Fragment homeFragment2 = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();
        Fragment homeFragment3 = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();

        mFragments = new ArrayList<>();
        mFragments.add(homeFragment);
        mFragments.add(homeFragment1);
        mFragments.add(homeFragment2);
        mFragments.add(homeFragment3);
        if (homeFragment != null) {
            //默认选中第一个
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frameLayout, homeFragment);
            transaction.commitAllowingStateLoss();
        }


    }

    private void initBottomTab() {
        NavigationController navigationController = binding.pagerBottomTab.material()
                .addItem(R.mipmap.yingyong, "首页")
                .addItem(R.mipmap.huanzhe, "工作")
                .addItem(R.mipmap.xiaoxi_select, "消息")
                .addItem(R.mipmap.wode_select, "我的")
                .setDefaultColor(ContextCompat.getColor(this, R.color.textColorVice))
                .build();
        //底部按钮的点击事件监听
        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                Fragment currentFragment = mFragments.get(index);
                if (currentFragment != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frameLayout, currentFragment);
                    transaction.commitAllowingStateLoss();
                }
            }

            @Override
            public void onRepeat(int index) {
            }
        });
    }
}
