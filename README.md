# 📚 E-Learning Mobile Application

A comprehensive educational Android application built with Java and Android Studio that provides an interactive learning platform for programming and computer science topics.

## 🚀 Features

### 🔐 User Authentication & Profile Management
- **Firebase Authentication** for secure user registration and login
- **Profile Management** with custom profile pictures using Firebase Storage
- **User Data Management** with Firebase Realtime Database
- **Session Management** and user state persistence

### 📖 Interactive Learning Modules
- **Chapter-based Learning Structure** - Organized content into 5 main chapters
- **Topic Navigation** - Grid-based topic selection with visual chapter indicators
- **Multi-language Support** - Covers Java, Android Development, PHP, JavaScript
- **Dynamic Content Loading** - Firebase-powered content management

### 💻 Code Learning & Examples
- **Interactive Code Viewer** with syntax highlighting using CodeView library
- **Comprehensive Code Library** with 22+ programming examples covering:
  - Graph algorithms (DFS, BFS, Dijkstra's, Kruskal's, Prim's)
  - Data structures (Stacks, Arrays, Linked Lists)
  - Algorithm implementations
  - Problem-solving examples
- **Code Categories** organized by difficulty and topic

### 🎯 Quiz System & Assessment
- **Dynamic Quiz Engine** powered by Firebase
- **Real-time Scoring** with immediate feedback
- **Progress Tracking** with performance analytics
- **Interactive UI** with animated question transitions
- **Question Sharing** functionality for social learning

### 🏆 Leaderboard & Gamification
- **Competitive Leaderboard** with real-time ranking system
- **Score Management** with user score tracking and comparison
- **Visual Rankings** using RecyclerView with user profiles
- **Performance Analytics** for user progression tracking

### 🎨 Advanced UI/UX Features
- **Material Design** components and animations
- **Navigation Drawer** with multiple menu options
- **Bottom Navigation** for main features
- **Responsive Design** for different screen sizes
- **Professional Splash Screen** with branding

## 🛠️ Technologies Used

- **Programming Language**: Java
- **IDE**: Android Studio
- **Backend**: Firebase (Authentication, Realtime Database, Storage, Analytics)
- **UI Libraries**: Material Design Components, Navigation Components, RecyclerView
- **Image Handling**: Glide, CircleImageView
- **Code Display**: CodeView-Android library
- **Build System**: Gradle with Kotlin DSL



## 🚀 Installation

### Prerequisites
- Android Studio Arctic Fox or later
- Minimum SDK: API 28 (Android 9.0)
- Target SDK: API 34 (Android 14)
- Google Services configuration

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/ZunaishaN00R/E-Learning-App-in-Java-on-Android-Studio.git
   cd E-Learning-App-in-Java-on-Android-Studio
   ```

2. **Configure Firebase**
   - Create a new Firebase project
   - Download `google-services.json` and place it in the `app/` directory
   - Enable Authentication, Realtime Database, and Storage in Firebase Console

3. **Build and Run**
   ```bash
   # Open in Android Studio
   # Sync project with Gradle files
   # Run on device or emulator
   ```

## 📁 Project Structure

```
app/src/main/java/com/zunaisha/e_learning_app/
├── authentication/          # User auth & profile management
├── chapter/                # Learning content chapters
├── chaptertopics/          # Topic navigation
├── leaderboard/            # Score & ranking system
├── ui/                     # User interface components
│   ├── code/              # Code examples & viewer
│   ├── home/              # Home screen
│   └── quiz/              # Quiz functionality
├── MainActivity.java       # Main application activity
└── SplashScreen.java      # App launch screen
```

## 🔧 Configuration

### Firebase Setup
1. Enable Email/Password authentication
2. Create Realtime Database with rules for read/write access
3. Configure Storage rules for image uploads
4. Set up Analytics for user behavior tracking

### Database Structure
```
Firebase Database:
├── Score/                 # User scores and leaderboard
│   └── {userId}/
│       ├── name
│       ├── image
│       └── score
└── Questions/            # Quiz questions
    └── {questionId}/
        ├── question
        ├── option1-4
        └── answer
```

## 🎯 Key Features Implementation

### Authentication Flow
- User registration with email/password
- Profile picture upload to Firebase Storage
- User data storage in Realtime Database
- Session management and auto-login

### Quiz System
- Dynamic question loading from Firebase
- Real-time score calculation
- Immediate feedback with color-coded answers
- Progress tracking and performance analytics

### Code Learning
- Syntax-highlighted code examples
- Categorized programming topics
- Interactive code viewer with multiple themes
- Comprehensive algorithm implementations

### Leaderboard System
- Real-time score updates
- User ranking with profile pictures
- Reverse chronological display
- Click interactions for user details

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📱 Screenshots

### 🏠 Home & Navigation

![Subjects Overview](assests/subjects.png)

*Main dashboard showing all available programming subjects and courses with clean grid layout*

![Subject Course Template](assests/subject_course_template.png)

*Individual course page displaying chapter structure and learning modules*

![Subjects Topics](assests/subjects_topics.png)

*Detailed topic breakdown within each subject showing specific learning areas*

### 🔐 User Authentication

![User Registration](assests/registeer_fir_new_user.png)

*New user registration form with email, password, and profile picture upload*

![Successful Registration](assests/successful_register.png)

*Confirmation screen displayed after successful user account creation*

![Login for Quiz](assests/login_for_quiz.png)

*User login interface with email and password fields for quiz access*

### 🎯 Quiz System

![Start Quiz Page](assests/start_quiz_page.png)

*Quiz initialization screen with subject selection and start options*

![Attempt Quiz Subject](assests/attempt_quiz_subject.png)

*Subject-specific quiz interface showing available topics and difficulty levels*

![User Attempt Quiz Questions](assests/user_attempt_its_quizs_question.png)

*Active quiz-taking interface with multiple choice questions and real-time feedback*

![Question with Code Templates](assests/question_with_solution_of_code_templates.png)

*Programming questions featuring code examples with syntax highlighting and explanations*

### 🏆 Leaderboard & Scores

![Leaderboard Scores](assests/leaderboard_scores.png)

*Real-time leaderboard displaying user rankings, scores, and profile pictures*

![UI to Show Leaderboard Registration](assests/ui_to_show_yo_open_leaderbporad_register_itsef_for_quiz.png)

*Leaderboard access interface with registration options and score tracking features*

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Authors

**Zunaisha N00R**
- GitHub: [@ZunaishaN00R](https://github.com/ZunaishaN00R)

**Usmana5809**
- GitHub: [@usmana5809](https://github.com/usmana5809)

## 🙏 Acknowledgments

- Firebase for backend services
- Material Design for UI components
- CodeView library for syntax highlighting
- Android community for resources and support

---

⭐ **Star this repository if you find it helpful!**  
