plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.job1"
    compileSdk = 36 // নোট: সাধারণত বর্তমানে ৩৫ ব্যবহার করা হয়, তবে ৩৬ থাকলেও সমস্যা নেই যদি আপনার কাছে SDK থাকে।

    defaultConfig {
        applicationId = "com.example.job1"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // এই প্যাকেজিং ব্লকটি যোগ করা হয়েছে ডুপ্লিকেট ফাইল এরর বন্ধ করতে
    packaging {
        resources {
            excludes += "/META-INF/INDEX.LIST"
            excludes += "/META-INF/DEPENDENCIES"
        }
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // সতর্কতা: এই লাইব্রেরিটি অ্যাপের ভেতর ইম্পোর্ট না করাই ভালো যদি না আপনি
    // গ্রেডল প্লাগইন হিসেবে এটি ব্যবহার করেন। এটিই আগের 'ApiService' এররটির উৎস হতে পারে।
    // implementation(libs.firebase.appdistribution.gradle)

    implementation(libs.androidx.runtime)
    implementation(libs.androidx.runtime.livedata)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    //navigation
    implementation("androidx.navigation:navigation-compose:2.7.5")

    //image loading
    implementation("io.coil-kt:coil-compose:2.5.0")
}