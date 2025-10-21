import React,{useState} from 'react';
import { Link } from 'react-router-dom';

function Navbar() {

const [nav,setnav]=useState(false);

const changeBackground =() =>{

    if (window.scrollY >= 50){
        setnav(true);
    }
    else{
        setnav(false);
    }
}
window.addEventListener('scroll',changeBackground);


  return (
    <nav className="nav">
        <div>
            <h1><Link to='/'>MENU</Link></h1>
            <h1><Link to='/addnews' >ADD NEWS</Link></h1>
        </div>

    </nav>
  )
}

export default Navbar;
