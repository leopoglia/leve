import { Link } from 'react-router-dom';
import './style.css';

export default function Header() {
    return (
        <div className="header-app">
            <Link to="/">
                <img className='logo' src="./logo.png" alt="" />
            </Link>

            <dl>

                <Link to="/trips" className='link'>
                    <dd>
                        <span className="material-symbols-outlined">
                            search
                        </span>
                    </dd>
                </Link>


            </dl>
        </div>
    );
}  