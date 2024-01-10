import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './CSS/Register.css'
import Headimg from '../Components/Headimg/Headimg';
import Contact from '../Components/Contact/Contact';

const Register = (props) => {
    const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")
    const [username, setUsername] = useState("")
    const [emailError, setEmailError] = useState("")
    const [passwordError, setPasswordError] = useState("")
    const [usernameError, setUsernameError] = useState("")

    const navigate = useNavigate();

    const onButtonClick = () => {
        setEmailError("")
        setPasswordError("")
        setUsernameError("")

        if ("" === username) {
            setUsernameError("Please enter a username")
            return
        }

        if (username.length < 5){
            setUsernameError("The username must be 5 characters or longer")
            return
        }

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

        navigate("/")

        // Authentication calls will be made here...       

    }

  return (
    <div className="register">

        <Headimg/>

        <div className="mainRegisterContainer">

            <div className="titleContainer">
                <div>Register</div>
            </div>
            <br />
            <div className="registerContainer">
                <input
                    value={username}
                    type='text'
                    placeholder="Enter your username here"
                    onChange={ev => setUsername(ev.target.value)}
                    className={"inputBox"} />
                <label className="errorLabel">{usernameError}</label>
            </div>
            <br />
            <div className="registerContainer">
                <input
                    value={email}
                    type='email'
                    placeholder="Enter your email here"
                    onChange={ev => setEmail(ev.target.value)}
                    className={"inputBox"} />
                <label className="errorLabel">{emailError}</label>
            </div>
            <br />
            <div className="registerContainer">
                <input
                    value={password}
                    type='password'
                    placeholder="Enter your password here"
                    onChange={ev => setPassword(ev.target.value)}
                    className={"inputBox"} />
                <label className="errorLabel">{passwordError}</label>
            </div>
            <br />
            <div className="registerContainer">
                <input
                    className="registerButton"
                    type="button"
                    onClick={onButtonClick}
                    value={"Register"} />
            </div>
        </div>

        <Contact/>

    </div>
  )
}

export default Register
