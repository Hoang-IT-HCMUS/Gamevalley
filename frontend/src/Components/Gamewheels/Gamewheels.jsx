import React from 'react'
import './Gamewheels.css'
import { useNavigate } from 'react-router-dom'

export function Gamewheels(gwtit){
    const navigate = useNavigate()
    const items = [
        {
            description: "Elden Ring",
            image: require("../Assets/game1.png"),
        },
        {
            description: "Baldur's Gate",
            image: require("../Assets/game2.png"),
        },
        {
            description: "Zelda: Breath Of The Wild",
            image: require("../Assets/game3.png"),
        },
        {
            description: "Star Wars Jedi: Survivor",
            image: require("../Assets/game4.png"),
        },
        {
            description: "Mortal Kombat I",
            image: require("../Assets/game5.png"),
        },
        {
            description: "Diablo IV",
            image: require("../Assets/game6.png"),
        },
        {
            description: "Final Fantasy XVI",
            image: require("../Assets/game7.png"),
        },
        {
            description: "Dead Space",
            image: require("../Assets/game8.png"),
        },
        {
            description: "HiFi-Rush",
            image: require("../Assets/game9.png"),
        },
        {
            description: "Street Fighter 6",
            image: require("../Assets/game10.png"),
        },
    ]

  return (
    <div className='Containergw'>
        <div className='titlegw'>
            <b>{gwtit.tit}</b>
        </div>
        <div className='inner' >
            {items.map((item, idx) => (
                <dix key={idx}>
                    <div className="imagegw">
                        <img src={item.image} alt='' onClick={() => navigate("/product", {state:{id:idx}})}/>
                    </div>
                    <p>{item.description}</p>
                </dix>
            ))}
        </div>
    </div>
  )
}

export default Gamewheels
