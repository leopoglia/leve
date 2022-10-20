import './style.css';

export default function Header() {
    return (
        <div className="header-app">
            <img className='logo' src="./logo.png" alt="" />

            <dl>

                <dd>
                    <span className="material-symbols-outlined">
                        search
                    </span>
                </dd>

                <dd>
                    <span className="material-symbols-outlined">
                        home
                    </span>
                </dd>

                <dd>
                    <span className="material-symbols-outlined">
                        login
                    </span>
                </dd>
            </dl>
        </div>
    );
}  