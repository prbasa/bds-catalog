import './styles';

type Props = {
    text: string;
}

const ButtonIcon = ({text} : Props) => {
  return (
    <div>
      <button className="btn btn-primary btn-icon">
        <h6>{text}</h6>
      </button>
    </div>
   
  );
};

export default ButtonIcon;
