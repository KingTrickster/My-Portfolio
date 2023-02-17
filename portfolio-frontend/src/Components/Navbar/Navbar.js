import React from "react";
import { NavLink, Link } from "react-router-dom";
import "../../App.css";

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-lg mb-4 pb-2 pt-3">
      <div className="container-fluid">
        <Link to="/" className="fs-3 fredoka text-light navbar-brand">
          Alejandro's <span className="text-info">Portfolio</span>
        </Link>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <style jsx>
            {`
              button[aria-expanded="false"] > .close {
                display: none;
              }
              button[aria-expanded="true"] > .open {
                display: none;
              }
            `}
          </style>
          <i className="fas fa-bars open fw-bold"></i>
          <i className="fas fa-times close fw-bold"></i>
        </button>
        <div
          className="collapse navbar-collapse justify-content-end"
          id="navbarNav"
        >
          <div className="navbar-nav fs-5">
            <NavLink
              activeClassName="active"
              to="/"
              className="nav-link text-light"
            >
              About me
            </NavLink>
            <NavLink to="/episodes" className="nav-link text-light">
              Certificates
            </NavLink>

            <NavLink to="/location" className="nav-link text-light">
              Projects
            </NavLink>
          </div>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
