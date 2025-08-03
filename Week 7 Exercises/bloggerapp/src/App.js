import React from "react";
import { books } from "./components/BookDetails";
import { blogs } from "./components/BlogDetails";
import { courses } from "./components/CourseDetails";
import "./App.css";

function BookDetails({ books }) {
  return (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );
}

function BlogDetails({ blogs }) {
  return (
    <ul>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <b>{blog.author}</b>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );
}

function CourseDetails({ courses }) {
  return (
    <ul>
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  );
}

function App() {
  const showCourses = true, showBooks = true, showBlogs = true; // Try various conditional rendering here

  return (
    <div className="container">
      {showCourses && (
        <div className="mystyle1">
          <h1>Course Details</h1>
          <CourseDetails courses={courses} />
        </div>
      )}
      {showBooks && (
        <div className="st2">
          <h1>Book Details</h1>
          <BookDetails books={books} />
        </div>
      )}
      {showBlogs && (
        <div className="v1">
          <h1>Blog Details</h1>
          <BlogDetails blogs={blogs} />
        </div>
      )}
    </div>
  );
}

export default App;
