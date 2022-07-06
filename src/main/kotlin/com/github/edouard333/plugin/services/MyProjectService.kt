package com.github.edouard333.plugin.services

import com.intellij.openapi.project.Project
import com.github.edouard333.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
