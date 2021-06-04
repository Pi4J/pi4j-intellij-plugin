package com.github.fdelporte.pi4jintellijplugin.services

import com.github.fdelporte.pi4jintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
