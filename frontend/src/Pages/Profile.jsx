import React from 'react'
import './CSS/Profile.css'
import { useState } from 'react';
import Navbar from '../Components/Navbar/Navbar';
import Headimg from '../Components/Headimg/Headimg';
import Contact from '../Components/Contact/Contact';
import loginic from '../Components/Assets/profilepic.png'
import Moment from 'react-moment';
import Gamewheels from '../Components/Gamewheels/Gamewheels';

const Profile = (props) => {
  const [showpassword, setShowPassword] = useState("")
  const [hideinfo, setHideInfo] = useState("")
  const [change, setChange] = useState("none")
  const [usernamechange, setUsernameChange] = useState("")
  const [dobchange, setDobChange] = useState('')
  const [passwordchange, setPasswordChange] = useState("")
  const [usernameerror, setUsernameError] = useState("")
  const [passworderror, setPasswordError] = useState("")
  const [validpass, setValidPass] = useState("")
  const [validpasserror, setValidPassError] = useState("")

  const onApplyButtonClick = () => {
    setValidPassError("")
    setPasswordError("")
    setUsernameError("")

    if ("" === usernamechange) {
        setUsernameError("Please enter a username")
        return
    }

    if (usernamechange.length < 5){
        setUsernameError("The username must be 5 characters or longer")
        return
    }

    if ("" === passwordchange) {
        setPasswordError("Please enter a password")
        return
    }

    if (passwordchange.length < 7) {
        setPasswordError("The password must be 8 characters or longer")
        return
    }

    if (validpass != passwordchange) {
      setValidPassError("Password is incorrect")
      return
    }
    // Authentication calls will be made here...       
    setHideInfo((prev) => !prev)
    setChange((prev) => !prev)
  }

  const clickchangestate = () => {
    setHideInfo((prev) => !prev)
    setChange((prev) => !prev)
  }

  return (
    <div className="mainprofile">
      <Headimg/>
      <Navbar/>
      <div className="profile">
        <img className='profilepic' style={{width:"300px", borderRadius:"50%"}} src={loginic} alt="" />
        <p className="username">
          Nguyen Van A
        </p>
      </div>
      <div className="information" style={{display: hideinfo? 'none':'flex'}}>
        <p className="info">
          Email: nguyenvana@gmail.com
        </p>
        <p className="info">
          Username: Nguyen Van A
        </p>
        <div className="info">
          <label for="DOB">Date of Birth: </label>
          <Moment id="DOB" format="DD/MM/YYYY">'2003-05-28'</Moment>
        </div>
        <p className="info">
          Sex: male
        </p>
        <div className="info">
          <label for="DJ">Date of Birth: </label>
          <Moment id="DJ" format="DD/MM/YYYY">'2023-12-16'</Moment>
        </div>
        <p className="passwordfield">
          Password: <p className="password" style={{visibility: showpassword ? 'visible' : 'hidden'}}>1234567</p>
          <div>
          <label for="check">Show Password</label>
          <input
            id="check"
            type="checkbox"
            value={showpassword}
            style={{marginRight:"20px"}}
            onChange={() =>
              setShowPassword((prev) => !prev)
            }
            />
            </div>
        </p>
        <input type="button" className="changestate" onClick={clickchangestate} value={"Change Info"} style={{width:"150px", height:"30px", borderRadius:"10px", border:"none", background:"lightblue", margin:"10px", fontWeight:"bold"}}/>
      </div>

      <div className="infochange" style={{display: change? 'none':'flex'}}>
        <div className="changeinfo">
          <label for="changeusername">Username: </label>
          <input
            id="changeusername"
            type='text'
            placeholder="Enter your new username"
            onChange={ev => setUsernameChange(ev.target.value)}
          />
          <label style={{fontSize:"12px", color:"red"}} className="errorLabel">{usernameerror}</label>
        </div>
          <div className="changeinfo">
          <label for="changedateofbirth">Date of Birth: </label>
          <input
            id="changedateofbirth"
            type='date'
            onChange={ev => setDobChange(ev.target.value)}        
          />
        </div>
        <div className="changeinfo">
          <label for="changepassword">Password: </label>
          <input
            id="changepassword"
            type='password'
            placeholder="Enter your new password"
            onChange={ev => setPasswordChange(ev.target.value)} 
          />
          <label style={{fontSize:"12px", color:"red"}} className="errorLabel">{passworderror}</label>
        </div>
        <div className="changeinfo">
          <label for="validatepassword">Password: </label>
          <input
            id="validatepassword"
            type='password'
            placeholder="Enter your new password again"
            onChange={ev => setValidPass(ev.target.value)}
          />
          <label style={{fontSize:"12px", color:"red"}} className="errorLabel">{validpasserror}</label>
        </div>
        <input type="button" className="infostate" onClick={onApplyButtonClick} value={"Apply"} style={{width:"150px", height:"30px", borderRadius:"10px", border:"none", background:"lightblue", margin:"10px", fontWeight:"bold"}}/>
      </div>

      <div className="gamehascomment">
        <Gamewheels tit="Game Has Comment"/>
      </div>

      <Contact/>
    </div>
  )
}

export default Profile