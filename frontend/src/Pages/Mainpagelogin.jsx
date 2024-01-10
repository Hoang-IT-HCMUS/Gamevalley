import './CSS/Mainpage.css';
import Navbar from '../Components/Navbar/Navbar';
import Headimg from '../Components/Headimg/Headimg';
import Hotgame from '../Components/Hotgame/Hotgame'
import Gamewheels from '../Components/Gamewheels/Gamewheels';
import Contact from '../Components/Contact/Contact';
import Tag from '../Components/Tag/Tag'
import Gen from '../Components/Generator/Generator'
import Pop from '../Components/Popular/Popular'

function Mainpagelogin() {
  return (
    <div className='WEB'>
      <div className='header'>
        <Headimg/>
        <Navbar/>
      </div>

      <div className='body'>
        <Hotgame/>
        <Gamewheels tit='New Games'/>
        <Gamewheels tit='High Rating Games'/>
        <Pop/>
        <Tag/>
        <Gen/>
        <Contact/>
      </div>

    </div>
  );
}

export default Mainpagelogin;