plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tpsensor"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.tpsensor"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    implementation(libs.lifecycle.viewmodel.ktx)
    androidTestImplementation(libs.espresso.core)
    // Vous avez cette ligne qui utilise le catalog
    implementation(libs.mpandroidchart)

    // Et aussi cette ligne qui définit la même dépendance directement
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.6.2")

    // Si vous utilisez des activités ou fragments
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.2")

    // Si vous avez besoin de l'intégration Java 8 (optionnel)
    implementation("androidx.lifecycle:lifecycle-common-java8:2.6.2")
}