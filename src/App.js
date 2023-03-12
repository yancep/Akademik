
import './App.css';


import Login from './components/Login.js';
import Home from './components/Home.js';
import React, { useState } from "react";
function App() {
  const [user,setUser] = useState([])
  return (
    <div className="App">
      {
        !user.length>0? <Login setUser={setUser}/>:<Home setUser={setUser}/>
      }
      
    </div>
  );
}

export default App;
