package c.lh.library_base.config;

/**
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */
public class ModuleLifecycleReflexs {

    public static final String BASE_INIT = "c.lh.library_base.base.BaseModuleInit";
    // 首页博文
    public static final String MAIN_INIT = "c.lh.library_main.MainModuleInit";
    // 项目
    public static final String PROJECT_INIT = "c.lh.project.module.init";
    //公众号
    public static final String PUBLIC_NUM_INIT = "c.lh.public.num.module.init";
    // 体系
    public static final String SYSTEM_INIT = "c.lh.system.module.init";
    //我的
    public static final String MY_INIT = "c.lh.my.module.init";

    public static  String []  initModuleNames = {BASE_INIT,
            MAIN_INIT,PROJECT_INIT,PUBLIC_NUM_INIT,SYSTEM_INIT,MY_INIT};
}
