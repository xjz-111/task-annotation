package com.leslie.task_annotation;

/**
 * 作者：xjzhao
 * 时间：2021-07-01 16:35
 */
public class Constant {

     public static final String ARGUMENTS_NAME = "TASK_MODULE_NAME";


     public static final String PACKAGE = "com.taskManager.task";

     public static final String DOT = ".";

     public static final String CLS_START = "_TaskManager";

     public static final String SEPARATOR = "$$";

     public static final String SUFFIX_TASK = "TASK";

     public static final String METHOD_NAME = "getTasks";

     public static final String FILE_NAME_START_WITH_PACKAGE = PACKAGE + DOT + CLS_START + SEPARATOR + SUFFIX_TASK + SEPARATOR;
     public static final String FILE_NAME_START = CLS_START + SEPARATOR + SUFFIX_TASK + SEPARATOR;

     public static final int DEFAULT_PRIORITY = -1;

     public static final int NO_DELAY = 0;

     public static final String TASK_CACHE_SP_KEY = "TASK_CACHE_SP_KEY";
     public static final String TASK_CACHE_SP_KEY_MAP = "TASK_CACHE_SP_KEY_MAP";
     public static final String TASK_CACHE_SP = "TASK_CACHE_SP";
     public static final String LAST_VERSION_NAME = "LAST_VERSION_NAME";
     public static final String LAST_VERSION_CODE = "LAST_VERSION_CODE";
    
     public static volatile boolean isDebug = false;


     public static final String NO_MODULE_NAME_TIPS = "These no module name, at 'build.gradle', like :\n" +
            "android {\n" +
            "    defaultConfig {\n" +
            "        ...\n" +
            "        javaCompileOptions {\n" +
            "            annotationProcessorOptions {\n" +
            "                arguments = [TASK_MODULE_NAME: project.getName()]\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}\n";
}
