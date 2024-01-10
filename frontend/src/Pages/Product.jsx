import React from 'react'
import "./CSS/Product.css"
import Comment from '../Components/Comment/Comment'
import Navbar from '../Components/Navbar/Navbar';
import Headimg from '../Components/Headimg/Headimg';
import Contact from '../Components/Contact/Contact';
import BasicRating from '../Components/Score/Score';
import { useState } from 'react';
import { useLocation } from 'react-router-dom';

const testdata = [
  [
    {
      img: [{image: require("../Components/Assets/game1.png")},{image: require("../Components/Assets/game11.png")}, {image: require("../Components/Assets/game12.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game2.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game3.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game4.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game5.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game6.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game7.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game8.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game9.png")}]
    },
    {
      img: [{image: require("../Components/Assets/game10.png")}]
    },
  ]
]

function Product(){

  const location = useLocation()

  const idx = location.state.id

  const [proIdx, setproIdx] = useState(0);

  const description = "Elden Ring is an action role-playing game developed by FromSoftware and published by Bandai Namco Entertainment. It was released worldwide for PlayStation 4, PlayStation 5, Xbox One, Xbox Series X/S, and Microsoft Windows on February 25, 2022. The game is set in the Lands Between, a fantasy world ruled by the Elden Ring, a powerful artifact that shattered during an event known as the Shattering. The player takes on the role of a Tarnished, one who was exiled from the Lands Between but has been re-elected to return and become the Elden Lord. The gameplay of Elden Ring is similar to previous FromSoftware games, such as the Dark Souls series and Bloodborne. It is a challenging action RPG with a focus on exploration and combat. The player can explore the vast open world of the Lands Between on foot or horseback, and will encounter a variety of enemies, from small mobs to large bosses."

  const nextGame = () => {
    setproIdx(proIdx === testdata[0][idx].img.length - 1 ? 0 : proIdx + 1);
  };

  const prevGame = () => {
    setproIdx(proIdx === 0 ? testdata[0][idx].img.length - 1 : proIdx - 1);
  };

  return(
    <div className="productpage">
      <Headimg/>
      <Navbar/>
      <div>{idx}</div>
      <div className="protitl">
        <p className="titl">Elden Ring</p>
        <p className="producer">FromSoft</p>
      </div>
      <div className="productdesc">
        <div className="proimage">
          {testdata[0][idx].img.map((item, index) => (
            <>           
                <div className="prod">
                  <img src={item.image} alt="" className={proIdx === index ? "prod" : "prod prod-hidden"} />
              </div>               
               </>                            
          ))}
        </div>

        <div className="pro-carousel-button">
          <button onClick={prevGame}
            className='pro-button-arrow-right'>
                <span class="material-symbols-outlined">arrow_back</span>
          </button>                

          <button onClick={nextGame}
            className='pro-button-arrow-left'>
              <span class="material-symbols-outlined">arrow_forward</span>
          </button>
        </div>

        <p style={{fontSize:25, fontWeight:'bold', margin:0}}>Description</p>
        <p className="desc">{description}</p>
      </div>

      <div className="score">
          <BasicRating score = '2.5'/>
      </div>

      <div className="commentsect">
          <Comment/>
      </div>

      <div className="othergames">

      </div>

      <Contact/>
    </div>
  )
}

export default Product