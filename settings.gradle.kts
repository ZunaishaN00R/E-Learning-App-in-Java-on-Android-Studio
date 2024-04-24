//pluginManagement {
//    repositories {
//        google()
//        mavenCentral()
//        gradlePluginPortal()
//    }
//}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//        maven { url 'https://jitpack.io' }
//    }
//}
//
//
//rootProject.name = "E_Learning_App"
//include(":app")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io")}
        mavenCentral()
    }
}

rootProject.name = "E_Learning_App"
include(":app")