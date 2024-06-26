import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './CSS/Login.css'
import Headimg from '../Components/Headimg/Headimg';
import Contact from '../Components/Contact/Contact';

const Login = (props) => {
    const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")
    const [emailError, setEmailError] = useState("")
    const [passwordError, setPasswordError] = useState("")
    
    const navigate = useNavigate();

    const onButtonClick = () => {
        setEmailError("")
        setPasswordError("")

        if ("" === email) {
            setEmailError("Please enter your email")
            return
        }

        if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email)) {
            setEmailError("Please enter a valid email")
            return
        }

        if ("" === password) {
            setPasswordError("Please enter a password")
            return
        }

        if (password.length < 7) {
            setPasswordError("The password must be 8 characters or longer")
            return
        }

        navigate("/home")
        // Authentication calls will be made here...       

    }

  return (
    <div className="mainContainer">

        <Headimg/>

        <div className="loginContainer">

            <div className="titleContainer">
                <div>Login</div>
            </div>
            <br />
            <div className="inputContainer">
                <input
                    value={email}
                    placeholder="Enter your email here"
                    onChange={ev => setEmail(ev.target.value)}
                    className={"inputBox"} />
                <label className="errorLabel">{emailError}</label>
            </div>
            <br />
            <div className="inputContainer">
                <input
                    value={password}
                    placeholder="Enter your password here"
                    onChange={ev => setPassword(ev.target.value)}
                    className={"inputBox"} />
                <label className="errorLabel">{passwordError}</label>
            </div>
            <p className='toregister' onClick={() => navigate("/register")} style={{textDecoration:"underline", cursor: "pointer"}}>Don't have an account? Click Here</p>
            <br />
            <div className="inputContainer">
                <input
                    className="inputButton"
                    type="button"
                    onClick={onButtonClick}
                    value={"Log in"} />
            </div>
        </div>

        <Contact/>

    </div>
  )
}

export default Login