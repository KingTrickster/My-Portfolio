import logo from "./logo.svg";
import React, { useState, useEffect } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";

import Navbar from "./Components/Navbar/Navbar";

import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Navbar />
      </div>
      <Routes>
        <Route path="/" element={<Home />} />
      </Routes>
    </Router>
  );
}

const Home = () => {
  return (
    <div className="App">
      <div className="container">
        <div className="row">
          <h1>Hello there!</h1>
        </div>
      </div>
    </div>
  );
};

export default App;
