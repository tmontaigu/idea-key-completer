package com.github.tmontaigu.ideakeycompleter.services

import com.intellij.openapi.project.Project
import com.github.tmontaigu.ideakeycompleter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
