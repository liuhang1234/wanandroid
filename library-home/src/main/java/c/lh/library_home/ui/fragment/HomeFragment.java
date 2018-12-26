package c.lh.library_home.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

import c.lh.library_base.router.RouterFragmentPath;
import c.lh.library_home.BR;
import c.lh.library_home.R;
import c.lh.library_home.databinding.FragmentHomeBinding;
import c.lh.library_home.ui.viewmodel.HomeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment<FragmentHomeBinding,HomeViewModel> {
    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
    }

    @Override
    public void initViewObservable() {
        super.initViewObservable();
        viewModel.addPage();
    }
}
