import React,{useState} from 'react'
import './Generator.css'

export const Generator = () => {

    const [opengenre, setopengenre] = useState(false)
    
    const tagli = [
        {
            genre: 'Action',
            id:1
        },
        {
            genre: 'Action RPG',
            id:2
        },
        {
            genre: 'Adventure',
            id:3
        },
        {
            genre: 'Casual',
            id:4
        },
        {
            genre: 'Fighting',
            id:5
        },
        {
            genre: 'Horror',
            id:6
        },
        {
            genre: 'Racing',
            id:7
        },
        {
            genre: 'Sci-fi',
            id:8
        },
        {
            genre: 'Simulator',
            id:9
        },
        {
            genre: 'Strategy',
            id:10
        },
    ]

    const year = ['1990','1991','1992','1993','1994','1995','1996','1997','1998','1999','2000','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011','2012','2013','2014','2015','2016','2017','2018','2019','2020','2021','2022','2023',]

  return (
    <div className="gencon">
        <div className="generatetit">
            <p><b>Game Generator</b></p>
        </div>

        <p className="genretext"><b>Choose Genre:</b></p>
        <select className='genremenu'>
            <option>--Genre--</option>
            {tagli.map((item) =>(
                <option value={item.id}>
                    <p>{item.genre}</p>
                </option>
            ))}
        </select>
        
        <p className="yeartext"><b>Choose Issue Year:</b></p>
        <p className="yearfrom">From:</p>
        <select className='yearmenufrom'>
            <option>--Year--</option>
            {year.map((item) =>(
                <option value={item.id}>
                    <p>{item}</p>
                </option>
            ))}
        </select>

        <p className="yearto">To:</p>
        <select className='yearmenuto'>
            <option>--Year--</option>
            {year.map((item) =>(
                <option value={item.id}>
                    <p>{item}</p>
                </option>
            ))}
        </select>

        <button className="genbutt">
            Generate!
        </button>

    </div>
  )
}

export default Generator