import { Route, Routes, Router } from 'react-router-dom';
import Login from './Login';
import Signup from './Signup';
import Recover from './Recover';
import './styles.css';
import Logotipo from 'assets/images/AAC.jpg';

const Auth = () => {
  return (
    <div className="auth-container">
       <div className='auth-banner-container'>
         <img src={Logotipo} />
         
       </div>
      
      <div className="auth-form-container">
        
       <Login />
        
      </div>
     
    </div>
  );
};

export default Auth;
