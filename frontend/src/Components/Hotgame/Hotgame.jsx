import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import "./Hotgame.css"

export const Hotgame = () => {

    const navigate = useNavigate()

    const [activeIndex, setActiveIndex] = useState(0);

    const items = [
        {   
            id: 0,
            description: "Elden Ring",
            image: require("../Assets/game1.png"),
        },
        {
            id: 1,
            description: "Baldur's Gate",
            image: require("../Assets/game2.png"),
        },
        {
            id: 2,
            description: "Zelda: Breath Of The Wild",
            image: require("../Assets/game3.png"),
        },
        {
            id: 3,
            description: "Star Wars Jedi: Survivor",
            image: require("../Assets/game4.png"),
        },
        {
            id: 4,
            description: "Mortal Kombat I",
            image: require("../Assets/game5.png"),
        },
        {
            id: 5,
            description: "Diablo IV",
            image: require("../Assets/game6.png"),
        },
        {
            id: 6,
            description: "Final Fantasy XVI",
            image: require("../Assets/game7.png"),
        },
        {
            id: 7,
            description: "Dead Space",
            image: require("../Assets/game8.png"),
        },
        {
            id: 8,
            description: "HiFi-Rush",
            image: require("../Assets/game9.png"),
        },
        {
            id: 9,
            description: "Street Fighter 6",
            image: require("../Assets/game10.png"),
        },
    ]

    const nextGame = () => {
        setActiveIndex(activeIndex === items.length - 1 ? 0 : activeIndex + 1);
    };
    
    const prevGame = () => {
        setActiveIndex(activeIndex === 0 ? items.length - 1 : activeIndex - 1);
    };

    const updateIndex = (newIndex) => {
        if (newIndex < 0) {
          newIndex = 0;
        } else if (newIndex >= items.length) {
          newIndex = items.length - 1;
        }
    
        setActiveIndex(newIndex);
    };

  return (
    <div className='carousel'>
        <div className="title">
            <b>Hot Games</b>
        </div>
        <div className="image">
            {items.map((item, idx) => (
                <div key={idx}>
                    <img src={item.image} alt='' onClick={() => navigate("/product", {state:{id:activeIndex}})} className={activeIndex === idx ? "image" : "image image-hidden"} />
                    {activeIndex === idx && <p>{item.description}</p>} 
                </div>
            ))}
        </div>

        <div className="carousel-button">
            <button onClick={prevGame}
            className='button-arrow-right'>
                <span class="material-symbols-outlined">arrow_back</span>
            </button>                

            <div className="indicators">
                {items.map((item,index)=>{
                    return(
                        <button onClick={() => {
                            updateIndex(index);
                        }}
                        className="indicator-button">
                            <span className={`material-symbols-outlined ${index===activeIndex? "indicator-symbol-active" : "indicator-symbol"}`}>radio_button_checked</span>
                        </button>
                    )
                })}
            </div>
            <button onClick={nextGame}
            className='button-arrow-left'>
                <span class="material-symbols-outlined">arrow_forward</span>
            </button>
        </div>
    </div>
  );
};

export default Hotgame