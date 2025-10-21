# Natural Disaster News System

A modern full-stack news application focused on natural disaster reporting and management, built with React.js admin panel and Spring Boot backend for efficient disaster news management and distribution.

## Project Overview
Natural Disaster News System is a comprehensive news management system that consists of:
- A React-based admin panel for content management
- A robust Spring Boot backend API
- Feedback system with email integration
- Modern, responsive user interface

## Project Structure

The project is organized into two main components:

### Frontend (N DES PPA/adminpanal)
```
adminpanal/
├── src/
│   ├── Components/
│   │   ├── Addnews.jsx      # News creation component
│   │   ├── Updatenews.jsx   # News update component
│   │   ├── Header.jsx       # Application header
│   │   ├── Navbar.jsx       # Navigation component
│   │   └── databaseC.js     # Database configuration
│   ├── App.js               # Main React component
│   └── index.js             # Application entry point
└── public/
    └── index.html           # HTML template
```

### Backend (backend/newsdot)
```
newsdot/
└── src/main/java/com/newsdot/newsdot/      # Will be renamed to reflect new project name
    ├── controller/          # REST API controllers for disaster news
    ├── service/            # Business logic for disaster management
    ├── repository/         # Data access layer
    ├── entity/            # Disaster news data models
    ├── dto/               # Data transfer objects
    └── mapper/            # Object mappers
```

## Prerequisites
- Java Development Kit (JDK) 11 or higher
- Node.js (v16+) and npm
- Maven for backend dependency management
- Your favorite IDE (VS Code, IntelliJ IDEA recommended)

## Getting Started

### Frontend Setup
1. Navigate to the admin panel directory:
```bash
cd "N DES PPA/adminpanal"
```

2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm start
```

The admin panel will be available at `http://localhost:3000`

### Backend Setup
1. Navigate to the backend directory:
```bash
cd backend/newsdot
```

2. Build the project:
```bash
./mvnw clean install
```

3. Start the Spring Boot application:
```bash
./mvnw spring-boot:run
```

The backend API will be available at `http://localhost:8080`

## Key Features

### Disaster News Management
- Create, read, update, and delete disaster-related news articles
- Categorization by disaster types (earthquakes, floods, hurricanes, etc.)
- Location-based disaster tracking
- Severity level indicators
- Rich text editing support
- Image and media upload capabilities
- Real-time disaster updates

### Feedback System
- User feedback collection
- Email notification system
- Contact form integration

### Technical Features
- RESTful API architecture
- DTO pattern for data transfer
- Exception handling
- Email service integration
- Responsive admin interface

## API Endpoints

### News Endpoints
- `GET /api/news` - Retrieve all news
- `POST /api/news` - Create new article
- `PUT /api/news/{id}` - Update article
- `DELETE /api/news/{id}` - Delete article

### Feedback Endpoints
- `POST /api/feedback` - Submit feedback
- `GET /api/feedback` - Retrieve feedback
- `POST /api/contact` - Submit contact form

## Contributing
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Troubleshooting
- **Frontend Issues**: Check browser console for errors and ensure all dependencies are installed
- **Backend Issues**: Review application logs and ensure database connectivity
- **Build Issues**: Verify Java and Node.js versions match requirements

## License
This project is licensed under the MIT License - see the LICENSE file for details
