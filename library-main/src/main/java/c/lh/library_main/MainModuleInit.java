package c.lh.library_main;

import android.app.Application;

import c.lh.library_base.base.IModuleInit;
import me.goldze.mvvmhabit.utils.KLog;

public class MainModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("主业务模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("主业务模块初始化 -- onInitLow");
        return false;
    }
}
