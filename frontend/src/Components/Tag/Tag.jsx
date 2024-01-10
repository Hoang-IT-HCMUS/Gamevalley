import React from 'react'
import './Tag.css'

export const Tag = () => {

  const tags =[
    {
      genre:"Action",
      image: require("../Assets/Genres/action.png")
    },
    {
      genre:"Action RPG",
      image: require("../Assets/Genres/actionrpg.png")
    },
    {
      genre:"Adventure",
      image:require("../Assets/Genres/adventure.png")
    },
    {
      genre:"Casual",
      image:require("../Assets/Genres/casual.png")
    },
    {
      genre:"Fighting",
      image:require("../Assets/Genres/fighting.png")
    },
    {
      genre:"Horror",
      image:require("../Assets/Genres/horror.png")
    },
    {
      genre:"Racing",
      image:require("../Assets/Genres/racing.png")
    },
    {
      genre:"Sci-fi",
      image:require("../Assets/Genres/scifi.png")
    },
    {
      genre:"Simulator",
      image:require("../Assets/Genres/simulator.png")
    },
    {
      genre:"Strategy",
      image:require("../Assets/Genres/strategy.png")
    }
  ]

  return (
    <div className='Tagtab'>
      <div className="gentit">
        <p><b>Genres:</b></p>
        </div>
      <div className="genre">
          {tags.map((item, idx) => (
            <div className="gen">
              <img src={item.image} alt="" />
              <p>{item.genre}</p>
            </div>
          ))}
      </div>
      </div>
  )
}

export default Tag