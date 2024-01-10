import React from 'react'
import './Popular.css'
import { useNavigate } from 'react-router-dom'

export const Popular = () => {
    const navigate = useNavigate()
    const popularitems = [
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
    <div className="popular">
        <p className='poptext'><b>Popular Games</b></p>

        <div className="popcontainer">
            {popularitems.map((item, idx) =>(
                <div className="popitem">
                    <img src={item.image} alt="" onClick={() => navigate("/product", {state:{id:idx}})}/>
                    <p>{item.description}</p>
                </div>
        ))}
        </div>
    </div>
  )
}


export default Popular