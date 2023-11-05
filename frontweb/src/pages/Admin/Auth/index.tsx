import { Route, Routes } from 'react-router-dom';
import Login from './Login';
import Signup from './Signup';
import Recover from './Recover';
import './styles.css';

const Auth = () => {
  return (
    <div className="auth-container">
      <div className="auth-form-container">
        
        <Routes>
          <Route path="/admin/auth/login" element={<Login />} />
          <Route path="/admin/auth/signup" element={<Signup />} />
          <Route path="/admin/auth/recover" element={<Recover />} />
         
        </Routes>
      </div>
    </div>
  );
};

export default Auth;
