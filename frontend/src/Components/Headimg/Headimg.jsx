import React from "react";
import './Headimg.css'
import logo from '../Assets/header_img1.png'

const Headimg = () => {
    return(
        <div className="headimg">
            <div className="head-logo">
                <img src={logo} alt=""/>
            </div>
        </div>
    )
}

export default Headimg