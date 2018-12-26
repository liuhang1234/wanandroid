package c.lh.library_base.router;

public class RouterFragmentPath {
    /**
     * 首页
     */
    public static class Main {
        private static final String MAIN = "/main";
        public static final String PAGER_MAIN = MAIN +"/Main";
    }

    public static class Home {
        private static final String HOME = "/home";
        public static final String PAGER_HOME = HOME + "/Home";
    }
    /**
     * 项目
     */
    public static class Project {
        private static final String PROJECT = "/project";
        public static final String PAGER_PROJECT = PROJECT + "/Project";
    }

    /**
     * 体系
     */
    public static class System {
        private static final String SYSTEM = "/system";
        public static final String PAGER_SYSTEM = SYSTEM + "/System";
    }

    /**
     * 公众号
     */
    public static class Public {
        private static final String PUBLIC = "/public";
        public static final String PAGER_PUBLIC= PUBLIC + "/Public";
    }
    /**
     * 我的
     */
    public static class My {
        private static final String MY = "/my";
        public static final String PAGER_MY= MY + "/My";
    }
}
