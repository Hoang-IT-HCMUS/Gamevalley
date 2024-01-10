import React from "react";
import './Navbar.css'
import homeic from '../Assets/home_icon.png'
import searchic from '../Assets/search_icon.png'
import loginic from '../Assets/login_icon.png'
import tagic from '../Assets/tag_icon.png'
import { useNavigate } from "react-router-dom";

const Navbar = () => {
    const navigatehome = useNavigate()
    return(
        <div className='navbar'>
            <ul className="nav-menu">
                <div className="menubutton">
                    <img src={homeic} width={25} height={25} alt="" /> 
                    <li onClick={() => navigatehome("/")}>Menu</li>
                </div>
                <div className="taglist">
                    <img src={tagic} width={25} height={25} alt="" />
                    <li>Tag</li>
                </div>
            </ul>
            <div className="searchbar">
                <img src={searchic}width={25} height={25} alt="" />
                <input placeholder="Search"/>
            </div>
            <div className="nav-login">
                <button onClick={() => navigatehome("/login")}><b>Login</b></button>
                <img src={loginic}  width={85} height={85} alt="" />
            </div>
        </div>
    )
}

export default Navbar