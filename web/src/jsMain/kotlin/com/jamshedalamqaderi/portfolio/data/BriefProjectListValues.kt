package com.jamshedalamqaderi.portfolio.data

import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

object ProjectNames {
    const val CIRCLES = "CIRCLES"
    const val KTRANSPORT: String = "KTRANSPORT"
    const val SOCIALDROID = "SOCIALDROID"
    const val FIVE_LETTER_WORDS: String = "FIVE_LETTER_WORDS"
}

val BriefProjectListValues: Map<String, List<Project>> = mapOf(
    ProjectNames.CIRCLES to listOf(
        Project.Name("CIRCLES - MOVE FORWARD"),
        Project.Tags(listOf("Flutter", "Dart", "Android", "Ios", "Stacked", "MVVM")),
        Project.Banner("images/projects/circles_banner.png"),
        Project.SectionHeader("Description"),
        Project.SectionBody(
            "Project Essence: Join CIRCLES, where knowledge meets innovation. I’ve improved the app with feature-First architecture and user experience enhancements.\n" +
                    "\n" +
                    "\uD83D\uDE80 Feature-Centric Codebase: I’ve refactored the codebase for better maintainability, scalability, and clarity.\n" +
                    "\n" +
                    "\uD83C\uDFA5 Dynamic Editor Studio: Users shape videos with templates and slide customization.\n" +
                    "\n" +
                    "\uD83C\uDFA7 Advanced Audio Mastery: I’ve used FFmpeg to remove hums and silence, enriching the audio quality.\n" +
                    "\n" +
                    "\uD83C\uDF10 Effortless Sharing: CIRCLES simplifies sharing across platforms.\n" +
                    "\n" +
                    "\uD83D\uDCA1 Profile & Feed Enhancements: I’ve refined user profiles and a TikTok-like feed.\n" +
                    "\n" +
                    "Tech Palette:\n" +
                    "\uD83D\uDCF1 Flutter: Crafting a responsive cross-platform canvas.\n" +
                    "\uD83C\uDFD7\uFE0F Feature-First Architecture: Breathing modularity and clarity into the codebase.\n" +
                    "\uD83D\uDD25 Firebase: Powering real-time updates and secure authentication.\n" +
                    "\uD83D\uDD10 Auth0: Elevating user access with fortified authentication.\n" +
                    "\uD83D\uDD04 CI/CD: Paving the way for seamless and efficient updates.\n" +
                    "\uD83D\uDD0D Sentry: Fortifying performance through meticulous error tracking.\n" +
                    "\uD83C\uDFB6 FFmpeg: Elevating audio-visual mastery with finesse.\n" +
                    "\uD83C\uDFDB\uFE0F MVVM: Orchestrating efficiency through structured separation.\n" +
                    "\n" +
                    "This project encapsulates my dedication to innovation, streamlined architecture, and enhancing user engagement.\uD83C\uDF1F"
        ),
        Project.SectionHeader("Links"),
        Project.Link("Official Website", "https://claps.ai"),
        Project.Link("LinkedIn", "https://www.linkedin.com/company/claps/"),
        Project.Link("Play Store", "https://play.google.com/store/apps/details?id=com.thecircles.circlesapp"),
        Project.Link("App Store", "https://apps.apple.com/us/app/circles-move-forward/id1627285385"),
    ),
    ProjectNames.KTRANSPORT to listOf(
        Project.Name("KTransport"),
        Project.Tags(listOf("KOTLIN", "MULTIPLATFORM", "GRPC")),
        Project.Banner("images/projects/ktransport_thumbnail.png"),
        Project.SectionHeader("Description"),
        Project.SectionBody(
            "\n" +
                    "KTransport Maven Central: Simplifying Cross-Platform Communication with gRPC\n" +
                    "\n" +
                    "KTransport is a Kotlin Multiplatform library that streamlines cross-platform communication between applications and services using the gRPC framework. Designed to offer a seamless experience across various platforms, KTransport empowers developers to effortlessly create gRPC services and clients in Kotlin, supporting both unary and server-side streaming RPCs.\n" +
                    "\n" +
                    "Key Technologies:\n" +
                    "\n" +
                    "Kotlin Multiplatform: Utilizes Kotlin's multiplatform capabilities to create a unified codebase for multiple platforms.\n" +
                    "gRPC: Leverages the robust gRPC framework for efficient and reliable communication between applications and services.\n\n" +
                    "Project Goals:\n" +
                    "\n" +
                    "Easy Integration: KTransport aims to provide a user-friendly API for creating gRPC services and clients, simplifying the integration process for developers.\n" +
                    "\n" +
                    "Cross-Platform Compatibility: By being built on top of the gRPC framework, KTransport ensures compatibility across various platforms, including Android, JVM, JavaScript, and WebAssembly.\n" +
                    "\n" +
                    "Support for Streaming RPCs: KTransport facilitates the creation of both unary and server-side streaming RPCs, enabling seamless data exchange between applications and services.\n" +
                    "\n" +
                    "Native Platform Expansion: The project's roadmap includes plans to expand support to additional native platforms, broadening its reach and applicability.\n" +
                    "\n" +
                    "Test Coverage: The project is committed to achieving comprehensive test coverage, ensuring stability and reliability across different scenarios.\n" +
                    "\n" +
                    "Community Contributions: KTransport welcomes contributions from the developer community, encouraging the addition of new features, bug fixes, and enhancements.\n" +
                    "\n" +
                    "Licensing and Support: The project operates under the Apache License 2.0 and provides the option for supporters to contribute through Patreon to help sustain its development."
        ),
        Project.SectionHeader("Links"),
        Project.Link("Github", "https://github.com/JamshedAlamQaderi/KTransport"),
    ),
    ProjectNames.SOCIALDROID to listOf(
        Project.Name("Socialdroid"),
        Project.Tags(
            listOf(
                "KOTLIN",
                "MULTIPLATFORM",
                "KTOR",
                "WEBSOCKET",
                "JETPACK COMPOSE",
                "KOBWEB",
                "FULL STACK DEVELOPMENT"
            )
        ),
        Project.Banner("images/projects/socialdroid/socialdroid_agents.png"),
        Project.SectionHeader("Description"),
        Project.SectionBody(
            "Socialdroid is a project that combines user engagement and automation with finesse. \uD83C\uDF10\n" +
                    "\n" +
                    "\uD83D\uDD11 Key Elements:\n" +
                    "\n" +
                    "\uD83D\uDCF1 Instant Device Access: Download and authorize the Socialdroid Agent app through QR codes. Secure and simple.\n" +
                    "\n" +
                    "\uD83E\uDD16 Dynamic Backend Commands: The Socialdroid Agent runs backend commands on mobile devices via UI elements or coordinates.\n" +
                    "\n" +
                    "\uD83D\uDCCB Versatile Task Management: Socialdroid can do various tasks – follow/unfollow, messaging, posting – with customizable flows.\n" +
                    "\n" +
                    "\uD83D\uDD00 Personalized Messaging: Using Spintaxt, Socialdroid creates unique messages during automated DMs.\n" +
                    "\n" +
                    "\uD83D\uDEE0\uFE0F Key Tech Stack:\n" +
                    "\n" +
                    "\uD83E\uDDE9 Kotlin: Foundation for the Android app.\n" +
                    "\n" +
                    "\uD83D\uDE80 Ktor & Ktor Client: Backend-client communication and data exchange.\n" +
                    "\n" +
                    "// My Own library at https://github.com/JamshedAlamQaderi/spintaxkt\n" +
                    "\uD83C\uDF00 Spintaxkt: Dynamic message creation.\n" +
                    "\n" +
                    "\uD83D\uDCCA Log4j & ELK Stack: Real-time logging and data analysis.\n" +
                    "\n" +
                    "\uD83D\uDC33 Docker: Consistent deployment for scalability.\n" +
                    "\n" +
                    "\uD83D\uDD04 CI/CD: Rapid iteration and deployment.\n" +
                    "\n" +
                    "⚛\uFE0F Jetpack Compose: Modern UI toolkit.\n" +
                    "\n" +
                    "\uD83D\uDD78\uFE0F Kobweb (Web Frontend) & Websocket: Real-time web dashboard and device management.\n" +
                    "\n" +
                    "\uD83D\uDDC4\uFE0F MinIO: Secure media file storage and access.\n" +
                    "\n" +
                    "\uD83D\uDD0D The Development Journey:\n" +
                    "\n" +
                    "Socialdroid’s architecture blends user interaction, backend orchestration, and UI rendering. I overcame challenges to emulate touch on Android devices.\n" +
                    "\n" +
                    "\uD83D\uDE80 Elevating Engagement:\n" +
                    "\n" +
                    "Socialdroid is more than an app; it’s an ecosystem that redefines user-tech engagement. It simplifies access, task execution, and personalization."
        ),
        Project.SectionHeader("Screenshots"),
        Project.Screenshots(
            listOf(
                "images/projects/socialdroid/socialdroid_login.png",
                "images/projects/socialdroid/socialdroid_task_create.png",
                "images/projects/socialdroid/socialdroid_tasks.png",
                "images/projects/socialdroid/socialdroid_tools.png",
            )
        ),
        Project.SectionHeader("Links"),
        Project.Link("Official Website", "https://socialdroid.io"),
    ),
    ProjectNames.FIVE_LETTER_WORDS to listOf(
        Project.Name("FIVE LETTER WORDS"),
        Project.Tags(
            listOf(
                "FLUTTER",
                "ANDROID",
                "IOS",
                "MVVM",
                "STACKED",
                "GOOGLE ADS",
                "IN-APP PURCHASE"
            )
        ),
        Project.Banner("images/projects/five_letter_word_thumbnail.png"),
        Project.SectionHeader("Description"),
        Project.SectionBody(
            "Introducing \uD83C\uDF1F FIVE LETTER WORDS \uD83C\uDF1F, an engaging mobile game that'll challenge your vocabulary and logic skills while having loads of fun! \uD83E\uDDE0\uD83C\uDFAE\n" +
                    "\n" +
                    "Guess the ✨ five-letter word ✨ with finesse and strategy in as few attempts as possible! \uD83D\uDD20 Choose your challenge level – easy, medium, or hard – each offering a unique number of tries and a diverse word pool. \uD83E\uDD14\uD83D\uDCA1\n" +
                    "\n" +
                    "Keep track of your \uD83D\uDCCA stats \uD83D\uDCCA as you conquer word puzzles! \uD83C\uDFC6 See how many games you've played, your correct guesses, incredible streaks, and your best and worst attempts. \uD83C\uDFB2\uD83C\uDFC1\n" +
                    "\n" +
                    "Head over to the stats page and immerse yourself in a vibrant world of colorful circles, informative bar graphs, and a list of impressive numbers. \uD83D\uDCC8\uD83C\uDF08\n" +
                    "\n" +
                    "Looking for more excitement? \uD83D\uDCA5 Unlock additional words and modes through convenient in-app purchases. \uD83D\uDCB8\uD83D\uDD13\n" +
                    "\n" +
                    "\uD83D\uDE80 Key Technologies \uD83D\uDE80:\n" +
                    "Fueled by Flutter, the ultimate cross-platform framework for crafting splendid native mobile apps. \uD83D\uDCF1\n" +
                    "Empowered by Stacked architecture, embracing the MVVM pattern for smooth sailing – complete with dependency injection, state management, and seamless navigation. \uD83C\uDFD7\uFE0F\uD83D\uDD04\n" +
                    "Backed by Firebase magic – your go-to for cloud storage, authentication, analytics, and beyond! ☁\uFE0F\uD83D\uDD25\n" +
                    "\n" +
                    "Ready to embark on this wordy adventure? \uD83C\uDF1F Download now and challenge your brain like never before! \uD83E\uDD13\uD83D\uDD0D"
        ),
        Project.SectionHeader("Links"),
        Project.Link("Play Store", "https://play.google.com/store/apps/details?id=five.letter.words.app"),
    )
)
