import React from 'react'
import './Contact.css'
import fbic from '../Assets/fbic.png'
import insic from '../Assets/insic.png'
import twiic from '../Assets/twiic.png'

export const Contact = () => {
  return (
    <div className='contact'>
      <div className="left">
        <div className='since'>
          <p><b>©2023-2023 GameValley</b></p>
        </div>

        <div className='tel'>
            <span class="material-symbols-outlined"> call </span>
            <p><b>Telephone: XXXXXXXXX</b></p>
        </div>

        <div className='mail'>
            <span class="material-symbols-outlined"> mail </span>
            <p><b>Gmail: XXXXXXXXXX@gmail.com</b></p>
        </div>
      </div>

      <div className="right">
        <div className="social_media">
          <img src={fbic} alt="" width={'30px'}/>
          <img src={insic} alt="" width={'30px'}/>
          <img src={twiic} alt="" width={'30px'}/>
        </div>
      </div>

    </div>
  )
}

export default Contact