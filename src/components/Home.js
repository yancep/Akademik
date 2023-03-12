import React from 'react'
import './Formulario.css'

export default function Home({ user , setUser}) {
const handLogout = () => {
    setUser([]);
}

  return(
    <div id='d'>
      <h1>Home</h1>
      <h1>{user}</h1>
      <button onClick={handLogout}>Cerrar sesion</button>
    </div>
  );
}
