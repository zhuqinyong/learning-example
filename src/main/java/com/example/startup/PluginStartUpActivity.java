package com.example.startup;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

/**
 * 插件启动类
 */
public class PluginStartUpActivity implements StartupActivity{
    @Override
    public void runActivity(@NotNull Project project) {
        System.out.println("启动插件");
    }
}
