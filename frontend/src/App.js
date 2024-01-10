import './App.css';
import {
  BrowserRouter as Router,
  Routes,
  Route,
} from "react-router-dom";
import Mainpagelogin from './Pages/Mainpagelogin'
import Mainpage from './Pages/Mainpage';
import Product from './Pages/Product';
import Login from './Pages/Login';
import Register from './Pages/Register';
import Profile from './Pages/Profile';

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route exact path = "/" element = {<Mainpagelogin />}/>
          <Route path="/home" element={<Mainpage />}/>
          <Route path="/login" element={<Login />}/>
          <Route path="/register" element={<Register />}/>
          <Route path="/profile" element={<Profile />}/>
          <Route path="/product" element={<Product />}/>
        </Routes>
      </Router>
    </>
  );
}

export default App;
